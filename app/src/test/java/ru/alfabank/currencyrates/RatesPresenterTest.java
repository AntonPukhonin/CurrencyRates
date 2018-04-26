package ru.alfabank.currencyrates;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Single;
import ru.alfabank.currencyrates.models.Currencies;
import ru.alfabank.currencyrates.models.RateResponse;

public class RatesPresenterTest {
    RatesPresenter presenter;
    @Mock
    RatesContract.Repo repo;
    @Mock
    RatesContract.View view;

    @Mock
    RateResponse rateResponse;


    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        presenter = new RatesPresenter(repo);

    }

    @Test
    public void load() {
        presenter.attachView(view);

        Mockito.when(repo.load(Mockito.anyBoolean())).thenReturn(Single.just(rateResponse));

        List<Currencies> currencies = new ArrayList<>();
        Mockito.when(rateResponse.getCurrencies()).thenReturn(currencies);

        presenter.load(false);

        Mockito.verify(view).showLoading(false);
        Mockito.verify(view).showData(currencies);
    }
}