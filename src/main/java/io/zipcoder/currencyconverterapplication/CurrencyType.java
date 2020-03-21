package io.zipcoder.currencyconverterapplication;

public enum CurrencyType {
    AUSTRALIAN_DOLLAR(2.70),
    CANADIAN_DOLLAR(2.64),
    CHINESE_YR(13.84),
    EURO(1.88),
    FRANC(2.02),
    POUND(1.64),
    RINGGIT(8.94),
    RUPEE(136.64),
    SINGAPORE_DOLLAR(1.86),
    US_DOLLAR(2.0),
    UNIVERSAL_CURRENCY(1.0),
    YEN(231.68);

    private final double rate;

    CurrencyType(double rate) {
        this.rate = rate;
    }

    public Double getRate() {
        return rate;
    }

    public static CurrencyType getTypeOfCurrency(ConvertableCurrency currency) {

        switch (currency.getClass().getSimpleName().toUpperCase()){
            case "YEN":
                return YEN;
            case "AUSTRALIANDOLLAR":
                return AUSTRALIAN_DOLLAR;
            case "CANADIANDOLLAR":
                return CANADIAN_DOLLAR;
            case  "CHINESEYR":
                return CHINESE_YR;
            case "EURO" :
             return    EURO;
            case "FRANC":
              return  FRANC;
            case "POUND":
                return POUND;
            case "RINGGIT":
                return RINGGIT;
            case "RUPEE":
                 return   RUPEE;
            case  "SINGAPOREDOLLAR":
                 return  SINGAPORE_DOLLAR;
            case "USDOLLAR":
             return US_DOLLAR;
            case "UNIVERSALCURRENCY":
             return   UNIVERSAL_CURRENCY;



        }
        return null;
    }
}
