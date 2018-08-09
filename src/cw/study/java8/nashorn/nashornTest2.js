var bigDecimal = Java.type('java.math.BigDecimal');

function calculate(amount,percentage) {
    var result = new bigDecimal(amount).multiply(new bigDecimal(percentage)).divide
                 (new bigDecimal("100"), 2, bigDecimal.ROUND_HALF_EVEN);
    return result.toPlainString();
}

var result = calculate(568000000000000000023,13.9);
print(result);




/*
* 这个例子是个什么鬼
* */


















