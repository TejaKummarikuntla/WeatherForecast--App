package weatherforecast.teja_kummarikuntla.com.weatherforecast;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import weatherforecast.teja_kummarikuntla.com.weatherforecast.model.Forecast;

/**
 * A simple {@link Fragment} subclass.
 */
public class ForecastFragment extends Fragment {


    public ForecastFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View forecastView = inflater.inflate(weatherforecast.buildappswithpaulo.com.weatherforecast.R.layout.fragment_forecast, container, false);

       // ImageView forecastIcon = forecastView.findViewById(R.id.forecastIconId);
        //TextView forecastTemp = forecastView.findViewById(R.id.forecastTempText);
        TextView forecastDate = forecastView.findViewById(weatherforecast.buildappswithpaulo.com.weatherforecast.R.id.forecastDateText);
        TextView forecastHigh = forecastView.findViewById(weatherforecast.buildappswithpaulo.com.weatherforecast.R.id.forecastHighText);
        TextView forecastLow = forecastView.findViewById(weatherforecast.buildappswithpaulo.com.weatherforecast.R.id.forecastLowText);
        TextView forecastDescription = forecastView.findViewById(weatherforecast.buildappswithpaulo.com.weatherforecast.R.id.forecastDescriptionTextview);

        Forecast forecast = (Forecast) getArguments().getSerializable("forecast");



      //  forecastTemp.setText(forecast.getCurrentTemperature());
        forecastDate.setText(forecast.getForecastDate());
        forecastHigh.setText(forecast.getForecastHighTemp());
        forecastLow.setText(forecast.getForecastLowTemp());
        forecastDescription.setText(forecast.getForecastWeatherDescription());



        return forecastView;
    }

    public static final ForecastFragment newInstance(Forecast forecast) {
        ForecastFragment forecastFragment = new ForecastFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("forecast", forecast);

        forecastFragment.setArguments(bundle);

        return forecastFragment;


    }

}
