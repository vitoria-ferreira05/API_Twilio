import com.twilio.Twilio
import com.twilio.rest.api.v2010.account.Message
import com.twilio.type.PhoneNumber

fun main() {

    Twilio.init("AC20b25848ba6d497d0452f38bd21faa11", "e71c3bb0cf3725461c623cca2c6d0199")

    val destino = PhoneNumber("+5534999790089")

    val remetente = PhoneNumber("+17312514152")

    val mensagem = "Esta é uma mensagem de teste do Twilio!"

    val message = Message.creator(destino, remetente, mensagem).create()

    println("SID da mensagem: ${message.sid}")
}
