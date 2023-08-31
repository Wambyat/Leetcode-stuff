function memoize(fn) {
    const cache = {};
    return function(...args) {
        const val = JSON.stringify(args);
        if (val in cache) {
            return cache[val]
        }

        else {
            cache[val] = fn.apply(this,args);
            return cache[val]
        }
    }
}