package mapsabra.piumi.com.mapsabra;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.

    @Override


        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_maps);
            // Obtain the SupportMapFragment and get notified when the map is ready to be used.
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }

    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p/>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
     */



        public void onMapReady(GoogleMap googleMap) {
            mMap = googleMap;
            // Add a marker in sabaragamuwa university and move the camera
            LatLng sabra = new LatLng(6.714682, 80.789314);
            LatLng sabraAdministrativeArea = new LatLng(6.714028, 80.788647);
            mMap.addMarker(new MarkerOptions()
                    .position(sabra)
                    .title("Marker in sabragamuwa university"));
            mMap.addMarker(new MarkerOptions()
                    .position(sabraAdministrativeArea)
                    .title("Administrative area")
                    .snippet("Administrative area")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_plusone_small_off_client)));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sabra, 15));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);
        }



}
