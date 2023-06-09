class Solution {
    public String convertToTitle(int columnNumber) {
        String excelSheetColumnTitle = "";
        while (--columnNumber >= 0) {
            excelSheetColumnTitle = (char)('A' + columnNumber % 26 ) + excelSheetColumnTitle;
            columnNumber /= 26;
        }
        return excelSheetColumnTitle;
    }

}