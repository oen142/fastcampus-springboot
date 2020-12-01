(async () => {
    const url = 'http://localhost:8080/restaurants';
    const response = await fetch(url);
    const restaurants = await response.json();

    const element = document.querySelector("#app");
    const restaurant = restaurants.map(({id, name, address}) =>
        `<p>${id}${name}${address}</p>`).join('');

    console.log(restaurant);
    element.innerHTML = restaurant
})();