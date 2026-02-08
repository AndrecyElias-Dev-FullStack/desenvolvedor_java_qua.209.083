const form = document.queryselector('form');
//declaração de variáveis
let nome= document.querySelector('#nome').vale;
let nome= document.querySelector('#email').vale;
let nome= document.querySelector('#nascimento').vale;
let nome= document.querySelector('#cpf').vale;
let nome= document.querySelector('#telefone').vale;
let nome= document.querySelector('#cep').vale;
let nome= document.querySelector('#endereco').vale;

//Saida de dados
document.querySelector('#nomeResult').innerHTML = '<b>Nome:</b> ${nome}';
document.querySelector('#nomeResult').innerHTML = '<b>Nome:</b> ${nome}';
document.querySelector('#nomeResult').innerHTML = '<b>Nome:</b> ${nome}';
document.querySelector('#nomeResult').innerHTML = '<b>Nome:</b> ${nome}';
document.querySelector('#nomeResult').innerHTML = '<b>Nome:</b> ${nome}';
document.querySelector('#nomeResult').innerHTML = '<b>Nome:</b> ${nome}';

//Apagar os dados d formulário
form.reset();


form.addEventlistener('submit', function(event) {
event.preventDefalt();
exibir instanceof();

});
