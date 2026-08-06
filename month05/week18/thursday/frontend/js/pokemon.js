const POKEMON_API_V2 = `https://pokeapi.co/api/v2/pokemon`;
const PAGE_SIZE = 20; // нэг удаадаа хэдэн ширхэг покемон мэдээлэл авах
let currentPage = 0;
let isLoading = false;
const POKEMON_CONTAINER = document.querySelector('.pokemon-container');

async function loadPokemons() {
    if (isLoading) return;

    isLoading = true; // load started

    try {
        const offset = currentPage * PAGE_SIZE;
        const listUrl = `https://pokeapi.co/api/v2/pokemon?offset=${offset}&limit=${PAGE_SIZE}`;
        // 1. get all list of pokemons

        const response = await fetch(listUrl);
        const data = await response.json();
        // console.log(data);

        // 2. call every detail of pokemon
        const detailPromise = data.results.map(async (item) => {
            const detailResponse = await fetch(item.url);
            return await detailResponse.json();
        });
        // console.log(detailPromise);

        // 3. Бүх promise хүсэлтүүдийг нэгтгэх
        const pokemonDetails = await Promise.all(detailPromise);
        // console.log(pokemonDetails);

        // 4. Render pokemons to the pokemon-container
        pokemonDetails.forEach((pokemon) => {
            renderCard(pokemon);
        })

    } catch (error) {
        console.error('Error during loading', error);
    } finally {
        isLoading = false;
    }
}

function renderCard(pokemon) {
    const card = document.createElement('div');
    card.className = 'card';
    card.dataset.id = pokemon.id;

    const artWork = pokemon.sprites.other['official-artwork'].front_default || pokemon.sprites.front_default;

    card.innerHTML = `
            <img src="${artWork}" alt=${pokemon.name} />
            <p>#${String(pokemon.id).padStart(3, '0')}</p>
            <h3>${pokemon.name}</h3>
    `;

    POKEMON_CONTAINER.appendChild(card);
}

loadPokemons();
