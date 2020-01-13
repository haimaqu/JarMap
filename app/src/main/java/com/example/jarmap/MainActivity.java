package com.example.jarmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.view.MapView;

public class MainActivity extends AppCompatActivity {
    public MapView mMapView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //将MapVIew对象与控件进行绑定
        this.mMapView = (MapView)this.findViewById(R.id.mapView);
        // 创建一个地图对象
        ArcGISMap map = new ArcGISMap(Basemap.Type.TOPOGRAPHIC, 34.056295, -117.195800, 16);
        // 设置地图展示在MapView控件中
        mMapView.setMap(map);
    }
}
