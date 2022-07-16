package lesson2.expert;

public class HomeworkExpert {
    private static final String OPEN_TAG = "<data>";
    private static final String CLOSE_TAG = "</data>";
    private static final String DELIMITER = ";";
    private static final String EMAIL_SYMBOL = "@";
    private static final String DOT_SYMBOL = ".";
    private static final String MASKING_SYMBOL = "*";
    private static final String NUMBERS = "0123456789";

    private static final String BLANK = " ";

    public static void main(String[] args) {
        //String before = "<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>";
        //"<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
                //String before = "<client>(Какие то данные)<data></data></client>";
        String before = "<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>";
        String after = masking(before);
        System.out.println(after);
    }

    public static String masking(String text) {
        int indexStartData = text.indexOf(OPEN_TAG) + OPEN_TAG.length();
        int indexEndData = text.indexOf(CLOSE_TAG);
        StringBuilder resultBuilder = new StringBuilder();

        if (indexEndData - indexStartData > 0) {
            String clientData = text.substring(indexStartData, indexEndData);
            String[] strings = clientData.split(DELIMITER);
            for (String field : strings) {
                if (field.contains(EMAIL_SYMBOL)) {
                    maskingEmail(field, resultBuilder);
                } else if (NUMBERS.contains(field.substring(0, 1))) {
                    maskingNumber(field, resultBuilder);
                } else {
                    maskingFullName(field, resultBuilder);
                }
            }
            String result = resultBuilder.toString();
            return text.replaceAll(clientData, result.substring(0, result.length() - 1));
        }

        return text;
    }

    private static void maskingFullName(String text, StringBuilder resultBuilder) {
        int nameIndex = text.indexOf(BLANK) + 1;
        int fatherNameIndex = text.indexOf(BLANK, nameIndex);
        String firstName = text.substring(0, nameIndex);
        String maskedFio = new StringBuilder()
                .append(text, 0, 1)
                .append(MASKING_SYMBOL.repeat(nameIndex - 3))
                .append(firstName.charAt(nameIndex - 2))
                .append(BLANK)
                .append(text, nameIndex, fatherNameIndex)
                .append(BLANK)
                .append(text, fatherNameIndex + 1, fatherNameIndex + 2)
                .append(DOT_SYMBOL)
                .append(DELIMITER)
                .toString();
        resultBuilder.append(maskedFio);
    }
    private static void maskingNumber(String text, StringBuilder resultBuilder) {
        String maskedPhone = new StringBuilder()
                .append(text, 0, 4)
                .append(MASKING_SYMBOL.repeat(3))
                .append(text.substring(7))
                .append(DELIMITER)
                .toString();
        resultBuilder.append(maskedPhone);
    }
    private static void maskingEmail(String text, StringBuilder resultBuilder) {
        int emailSymbolIndex = text.indexOf(EMAIL_SYMBOL);
        int endDomainIndex = text.lastIndexOf(DOT_SYMBOL);
        String maskingEmail = new StringBuilder()
                .append(text, 0, emailSymbolIndex - 1)
                .append(MASKING_SYMBOL)
                .append(EMAIL_SYMBOL)
                .append(MASKING_SYMBOL.repeat(endDomainIndex - emailSymbolIndex - 1))
                .append(text, endDomainIndex, text.length())
                .append(DELIMITER)
                .toString();
        resultBuilder.append(maskingEmail);
    }
}
