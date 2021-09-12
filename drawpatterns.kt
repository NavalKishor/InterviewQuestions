/*
<p><strong>Draw pattern like pyramid of number, asterisk and alphabet </strong></p>

<p>simple logic to keep in mind is its a square matrix of NxN order</p>
*/
fun main() {
    println("----print Asterisk Pyramid----")
    val rows=5
    for(row in 0..rows){
        for(col in row..rows){
         print(" ")
        }
        for(col in 0..row){
         print("*")
        }
        for(col in row downTo 1){
         print("*")
        }
        println()
    }
    println("----print No Pyramid----")
    for(row in 0..rows){
        for(col in row..rows){
         print(" ")
        }
        for(col in 0..row){
         print("${col+1}")
        }
        for(col in row downTo 1){
         print("${col}")
        }
        println()
    }
    println("----print Alphabet Pyramid----")
    for(row in 0..rows){
        for(col in row..rows){
         print(" ")
        }
        for(col in 0..row){
         print("${(64+col+1).toChar()}")
        }
        for(col in row downTo 1){
         print("${(64+col).toChar()}")
        }
        println()
    }
    println("----print Number incremental order ----")
    for(row in 0..rows){
        for(col in 0..row){
         print("${col+1}")
        }
        println()
    }
    println("----print Number decremental order ----")
    for(row in rows downTo 0){
        for(col in 0..row){
         print("${col+1}")
        }
        println()
    }
}
//region
/*
output

----print Asterisk Pyramid----
      *
     ***
    *****
   *******
  *********
 ***********
----print Number Pyramid----
      1
     121
    12321
   1234321
  123454321
 12345654321
----print Alphabet Pyramid----
      A
     ABA
    ABCBA
   ABCDCBA
  ABCDEDCBA
 ABCDEFEDCBA
----print Number incremental order ----
1
12
123
1234
12345
123456
----print Number decremental order ----
123456
12345
1234
123
12
1
*/
//endregion
