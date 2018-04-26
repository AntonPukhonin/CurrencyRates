package ru.alfabank.currencyrates;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class FormatUtils {
    private static DecimalFormat formatter;

    static {
        formatter = new DecimalFormat();
        formatter.setMinimumFractionDigits(2);
        formatter.setGroupingUsed(true);
        formatter.setGroupingSize(3);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        symbols.setGroupingSeparator(' ');
        formatter.setDecimalFormatSymbols(symbols);
        formatter.setRoundingMode(RoundingMode.DOWN);
    }

    public static String formatAmount(String amount) {
        return formatter.format(new BigDecimal(amount));
    }
}
