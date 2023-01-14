<div id="speed"></div>
<script>
    var startTime, endTime;
    var download = new Image();
    download.onload = function () {
        endTime = (new Date()).getTime();
        showResults();
    }
    startTime = (new Date()).getTime();
    var cacheBuster = "?nnn=" + startTime;
    download.src = "path/to/image.jpg" + cacheBuster;
    function showResults() {
        var duration = (endTime - startTime) / 1000;
        var bitsLoaded = download.src.length * 8;
        var speedBps = (bitsLoaded / duration).toFixed(2);
        var speedKbps = (speedBps / 1024).toFixed(2);
        var speedMbps = (speedKbps / 1024).toFixed(2);
        document.getElementById("speed").innerHTML = "Your connection speed is: " + speedMbps + " Mbps";
    }
</script>
