let cars = ['Toyota', 'Honda', 'Subaru','Nissan', 'Kia', 'Hyundai'];

// Map - Maps to array 'I love [carManufacturerName]'
cars.map(car => `I love ${car}!`);

// Filter - Filter array to only cars that start with the letter 'H'
cars.filter(car => car[0] === 'H' && car);

// Reduce - Reverse array order
cars.reduce((acc, car) => [car].concat(acc));