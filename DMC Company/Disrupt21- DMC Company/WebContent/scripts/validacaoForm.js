document.dadosContato.nome.addEventListener('blur', validarNome)
function validarNome() {
    var nome = document.dadosContato.nome.value
    var spanNome = document.querySelector('.spanValidacao')
    if (nome == "" || nome.indexOf(" ") == -1) {
        spanNome.innerHTML = "Nome digitado incorretamente"
        return 1
    }else {
        spanNome.innerHTML = ''
        return 0
    }
}
document.dadosContato.email.addEventListener('blur', validarEmail)
function validarEmail() {
    var email = document.dadosContato.email.value
    var spanEmail = document.querySelector(".spanValidacao")
    var arrobaEmail = email.indexOf('@')
    var pontoEmail = email.lastIndexOf('.')
    if (email == "" || arrobaEmail == -1 || pontoEmail ==-1) {
        spanEmail.innerHTML = "Email digitado incorretamente"
        return 1
    } else {
        spanEmail.innerHTML = ''
        return 0
    }
}
document.dadosContato.cpf.addEventListener('blur', validarCpf)
function validarCpf() {
    var cpf = document.dadosContato.cpf.value
    var spanCpf = document.querySelector(".spanValidacao")
    if (cpf == "") {
        spanCpf.innerHTML = "CPF digitado incorretamente"
        return 1
    } else {
        spanCpf.innerHTML = ''
        return 0
    }
}
document.dadosContato.descricao.addEventListener('blur', validarDuvida)
function validarDuvida() {
    var duvida = document.dadosContato.descricao.value
    var spanDuvida = document.querySelector(".spanValidacao")
    if (duvida == "") {
        spanDuvida.innerHTML = "Campo digitado incorretamente"
        return 1
    } else {
        spanDuvida.innerHTML = ''
        return 0
    }
}
document.dadosContato.btn.addEventListener('click', validarBtn)
function validarBtn() {
    var spanBtn = document.querySelector(".spanValidacao")
    var validaNome = validarNome()
    var validaEmail = validarEmail()
    var validaCpf = validarCpf()
    var validaDuvida = validarDuvida()
    if (validaNome ==1 || validaEmail ==1 || validaCpf ==1 || validaDuvida == 1) {
        spanBtn.innerHTML = "Alguma opção não foi preenchida corretamente"
    } else {
        document.querySelector("#idFormContato").submit()
    }
}
