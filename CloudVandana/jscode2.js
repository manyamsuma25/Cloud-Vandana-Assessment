2.Perform sorting of an array in descending order.
.................................................................................................................



function sortDescending(arr) {
    return arr.sort((a, b) => b - a);
}

const numbers = [5, 2, 9, 1, 5, 6];
const descendingSorted = sortDescending(numbers);
console.log(descendingSorted);

OUTPUT: 9,6,5,5,2,1