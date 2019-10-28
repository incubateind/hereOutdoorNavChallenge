var platform=new H.service.Platform({'apikey':'{aL4rwijWOLHWbgsGe0_w59nt7iyk2nN4_w1LxarK4lw}'});
  console.log(platform);
  var maptypes = platform.createDefaultLayers();
  
  var map = new H.Map(
    document.getElementById('mapContainer'),
    maptypes.vector.normal.map,
    {
      zoom: 10,
      center: { lng: 13.4, lat: 52.51 }
    });
