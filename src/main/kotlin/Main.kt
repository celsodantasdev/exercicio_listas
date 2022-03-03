fun main(){

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
 trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
 programa deverá atender as seguintes funcionalidades:

 Armazenar dados da List
 Remover dados da list;
 Atualizar dados da list.
 Apresentar todos os dados da list.*/


    var loja = mutableListOf("camisa polo", "camisa social", "calça jeans")

    println("Escolha um item. Os itens disponíveis são: camisa polo, camisa social, calça jeans.")
    var itemEscolhido = readLine()!!

    when (itemEscolhido) {

        "camisa polo" -> loja.remove("camisa polo")
        "camisa social" -> loja.remove("camisa social")
        "calça jeans" -> loja.remove("calça jeans")
    }

    println("Os items disponíveis agora são: ")

    loja.forEach {
        println(it)

        println("Deseja adicionar mais algum item que não está na lista? Digite sim ou não")
        var resposta = readLine()!!

        if (resposta == "sim") {
            println("Qual o novo item? ")
            var novoItem = readLine()!!
            loja.add(novoItem)
        } else if (resposta == "não")
            println("Ok! os itens disponíveis no estoque permanecem os mesmos!")

        println("Ok! a lista atualizada é: ")

        loja.forEach {
            println(it)
        }

    }
}