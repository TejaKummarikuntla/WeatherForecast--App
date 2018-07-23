package weatherforecast.teja_kummarikuntla.com.weatherforecast.data;

import java.util.ArrayList;

import weatherforecast.teja_kummarikuntla.com.weatherforecast.model.Forecast;

/**
 * Created by paulodichone on 11/17/17.
 */

public interface ForecastListAsyncResponse {
    void processFinished(ArrayList<Forecast> forecastArrayList);
}
