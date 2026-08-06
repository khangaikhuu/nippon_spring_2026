// 1. API config
const API_KEY = "1e72f1a0c21c1492dba3d5309891e118";
let LATITUDE = 47.922355;
let LONGITUDE = 106.905075;
let DEFAULT_CITY_NAME = 'Ulaanbaatar';
// ,
// const API_URL = `https://api.openweathermap.org/data/2.5/onecall/current?units=metric&appid=${API_KEY}`;
const API_URL =
    `https://api.openweathermap.org/data/2.5/weather` +
    `?lat=${LATITUDE}` +
    `&lon=${LONGITUDE}` +
    `&units=metric` +
    `&appid=${API_KEY}`;

let GEO_API_URL = `http://api.openweathermap.org/geo/1.0/direct?q=${DEFAULT_CITY_NAME}&limit=10&appid=${API_KEY}`;

// 2. DOM elements
const searchInput = document.getElementById('search-input');
const searchBtn = document.getElementById('search-btn');
const weatherInfo = document.getElementById('weather-info');
const spinner = document.getElementById('spinner');

// 3.1 fetch API ашиглах
function useFetchAPI() {
    fetch(GEO_API_URL)
        .then(response => response.json())
        .then((data) => {
            if (data.length === 0) {
                throw new Error('City not found.')
            }
            console.log(data);

            const cityName = data[0].name;
            document.getElementById('city-name').textContent = cityName;
            weatherInfo.style.display = 'block';
        }).catch(error => console.error(error));
}

// 3.2 async/await
async function useAsyncAwait(city) {
    try {
        // spinner
        spinner.style.display = 'block';
        weatherInfo.style.display = 'none';

        // async await
        // console.log(GEO_API_URL);
        const geoResponse = await fetch(`http://api.openweathermap.org/geo/1.0/direct?q=${city}&limit=10&appid=${API_KEY}`); // Promise

        const geoData = await geoResponse.json();
        console.log(geoData);
        LATITUDE = geoData[0].lat;
        LONGITUDE = geoData[0].lon;

        const weatherResponse = await fetch(`https://api.openweathermap.org/data/2.5/weather` +
            `?lat=${LATITUDE}` +
            `&lon=${LONGITUDE}` +
            `&units=metric` +
            `&appid=${API_KEY}`);
        const weatherData = await weatherResponse.json();
        console.log(weatherData);

        document.getElementById('city-name').textContent = geoData[0].name;
        document.getElementById('temp').innerHTML = Math.round(weatherData.main.temp) + '&#xb0;C';
        document.getElementById('description').textContent = weatherData.weather[0].description;

        // spinner ends here
        spinner.style.display = 'none';
        weatherInfo.style.display = 'block';
    } catch (error) {
        spinner.style.display = 'none';
        alert(error.message);
    }
}

useAsyncAwait('Choibalsan');
// useFetchAPI();

searchBtn.addEventListener('click', () => {
    const cityName = searchInput.value;
    useAsyncAwait(cityName);
});


searchInput.addEventListener('keydown', (e) => {
    console.log(e);
    if (e.key = 'Enter') {
        console.log('Enter clicked');
    }
})
