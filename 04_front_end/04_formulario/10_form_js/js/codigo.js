//declarar as variáveis globais
const form = document.querySelector('form');

form.addEventListener('submit', function(event) {
    //desativar o submit
    event.preventDefalt();
    //declaração de ariaveis locais
    let texto = document.querySelector('#texto').value;

    //exibe o texto em forma de caixa de dialogo
    alert(texto);