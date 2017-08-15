package com.abdulmajeed_ahmed.myapp;
/**
 * Created by Eng. Abdulmajeed Ahmed on 8/14/2017.
 */

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapTab extends Fragment {
    private View originalView;
    private MapView myMapView;
    private GoogleMap myGoogleMap;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    originalView = inflater.inflate(R.layout.map_tab, container, false);
    //inflate layout to this fragment.
        return originalView;
}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {super.onCreate(savedInstanceState);}

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) { //called immediately after onCreateView(LayoutInflater, ViewGroup, Bundle).
        super.onViewCreated(view, savedInstanceState);

        myMapView = originalView.findViewById(R.id.myMapView);
        if(myMapView!=null){ //means exists
            myMapView.onCreate(null);
            myMapView.onResume();

            myMapView.getMapAsync(new OnMapReadyCallback() { // implementing the interface Anonymously..
                @Override
                public void onMapReady(GoogleMap googleMap) {
                    try {
                        MapsInitializer.initialize(getActivity().getApplicationContext());
                    } catch (Exception e) {
                        Toast.makeText(originalView.getContext(), R.string.map_error_msg, Toast.LENGTH_LONG).show();
                    }
                    myGoogleMap = googleMap;
                   // myGoogleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                    LatLng stc = new LatLng(24.758565,46.712784);
                    myGoogleMap.addMarker(new MarkerOptions()
                            .snippet(getString(R.string.stc_snippet))
                            .position(stc)
                            .title(getString(R.string.stc)));
                    myGoogleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(stc,16f)); // for zooming.
                }
            });
        }
    }
}
