fun main() {

    val inscritos = mutableListOf<Usuario>()

    val conteudoEducacional = ConteudoEducacional("Kotlin Experience", 40)

    var alexandre = Usuario("Alexandre")

    println("O curso ${conteudoEducacional.nome} tem duração de ${conteudoEducacional.duracao} horas.")

}