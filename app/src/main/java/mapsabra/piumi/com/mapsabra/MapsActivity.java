package mapsabra.piumi.com.mapsabra;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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

    //searching part
    public void onSearch(View view){

       EditText location_tf = (EditText) findViewById(R.id.etAddress);
        String location = location_tf.getText().toString();

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
            LatLng sabraGround = new LatLng(6.710839, 80.789654);
            LatLng swimmingPool = new LatLng(6.714533, 80.786837);// should implement
            LatLng hunduwaPlayGround = new LatLng(6.715319, 80.787561);// should implement
            LatLng tennisCourt = new LatLng(6.714563, 80.787256);// should implement
            LatLng panibaratha = new LatLng(6.713432, 80.788209);// should implement
            LatLng quatus = new LatLng(6.712787, 80.788772);// should implement
            LatLng quatus2 = new LatLng(6.712406, 80.789130);// should implement
            mMap.addMarker(new MarkerOptions()
                    .position(sabra)
                    .title("Marker in sabragamuwa university"));
            mMap.addMarker(new MarkerOptions()
                    .position(sabraAdministrativeArea)
                    .title("Administrative area")
                    .snippet("Administrative area")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_plusone_small_off_client)));

            //swimming pool
            mMap.addMarker(new MarkerOptions()
                    .position(swimmingPool)
                    .title("Swimming Pool")
                    .snippet("Swimming Pool")
                    );

            //hunduwa playground. Have to change name
            mMap.addMarker(new MarkerOptions()
                            .position(hunduwaPlayGround)
                            .title("Hunduwa")
                            .snippet("Hunduwa")
            );

            //tennis court
            mMap.addMarker(new MarkerOptions()
                            .position(tennisCourt)
                            .title("Tennis Court")
                            .snippet("Tennis Court")
            );

            //panibharatha.Have to change name
            mMap.addMarker(new MarkerOptions()
                            .position(panibaratha)
                            .title("Panibharatha")
                            .snippet("Panibharatha")
            );

            //quatus 1 chnge the name
            mMap.addMarker(new MarkerOptions()
                            .position(quatus)
                            .title("quatus")
                            .snippet("quatus")
            );

            //quatus 2 chnge the name
            mMap.addMarker(new MarkerOptions()
                            .position(quatus2)
                            .title("quatus2")
                            .snippet("quatus2")
            );

//.icon(BitmapDescriptorFactory.fromResource(R.drawable.pool))
            mMap.addMarker(new MarkerOptions()
                    .position(sabraGround)
                    .title("University Ground")
                    .snippet("University Ground")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_plusone_small_off_client)));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sabra, 15));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);
        }



}
