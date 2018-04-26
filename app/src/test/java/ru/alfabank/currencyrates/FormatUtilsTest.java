package ru.alfabank.currencyrates;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
public class FormatUtilsTest {

    @Test
    public void formatAmount() {
        assertThat(FormatUtils.formatAmount("10.33")).isEqualTo("10.33");
        assertThat(FormatUtils.formatAmount("10")).containsOnlyDigits();
        assertThat(FormatUtils.formatAmount("10000.1")).isEqualTo("10 000.10");
        assertThat(FormatUtils.formatAmount("20000")).isEqualTo("20 000");
        assertThat(FormatUtils.formatAmount("40000")).isEqualTo("40 000");
    }
}