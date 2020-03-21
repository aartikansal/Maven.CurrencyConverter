package io.zipcoder.currencyconverterapplication.currencies;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {
    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/CurrencyType.UNIVERSAL_CURRENCY.getRate();
    }
}
