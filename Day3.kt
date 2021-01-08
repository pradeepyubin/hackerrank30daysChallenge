import java.util.Scanner

fun main(args: Array<String>)
{
    val inputType: String
    val scan = Scanner(System.`in`)
    val N = scan.nextLine().trim().toInt()
    if(0 < N && N <=100)
    {
        if(N%2 != 0)
        {
            inputType = "Weird";
        }
        else
        {
            if(2<= N && N <=5)
            {
                inputType = "Not Weird";
            }
            else if(6<= N && N <=20)
            {
                inputType = "Weird";
            }
            else
            {
                inputType = "Not Weird";
            }
        }
        println(inputType)
    }
}
