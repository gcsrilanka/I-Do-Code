/**
 * Returns true if argument is a JS primitive else false
 * @param value
 * @returns {boolean}
 */
function isValuePrimitive(value) {
  if (!arguments.length) {
    throw new Error('Required argument is empty!');
  }

  if (value === null) return true;

  switch (typeof value) {
    case 'string':
    case 'number':
    case 'boolean':
    case 'undefined':
      return true;
    default:
      return false;
  }
}

// very simple test cases
console.assert(
  isValuePrimitive('string') === true,
  `Expected return value "true" but got ${isValuePrimitive('string')}`
);

console.assert(
  isValuePrimitive({}) === false,
  `Expected return value "false" but got ${isValuePrimitive({})}`
);

console.assert(
  isValuePrimitive(null) === true,
  `Expected return value "true" but got ${isValuePrimitive(null)}`
);
