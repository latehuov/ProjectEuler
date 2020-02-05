var fibSum = 0
var fibArray = [0, 1]
var i = 1
while (i < 4000000) {
    fibArray.push(i)
    i = fibArray[(fibArray.length - 1)] + fibArray[(fibArray.length - 2)]
    if (i % 2 == 0){
        fibSum = fibSum + i
        console.log(fibSum)
    }
}
