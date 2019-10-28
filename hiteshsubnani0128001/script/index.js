console.log("Hello world");
  var platform=new H.service.Platform({'apikey':'{mPTrWt-3uSN91pPgGu5eE-zRbGWg1YZE2GewjohTHSM}'});
  console.log(platform);
  var maptypes = platform.createDefaultLayers();
  
  var map = new H.Map(
    document.getElementById('mapContainer'),
    maptypes.vector.normal.map,
    {
      zoom: 10,
      center: { lng: 13.4, lat: 52.51 }
    });
