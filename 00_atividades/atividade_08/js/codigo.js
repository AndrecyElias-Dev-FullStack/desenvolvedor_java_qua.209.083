/*
* Crie um programa utilizando  Bootstep e JS que receba do usuário:
*Nome 
*Data de nascimento
*genero
*email
*telefone
*peso
*altura
*e mostre na pagina todos esses dados junto com seu IMC e o seu diagnóstico.
*Divirtam-se !!
*/
const form = document.querySelector('form');

const calcularImc = (peso, altura) => {
let imc = peso/(altura*altura);
result = (imc < 18.5) ? " Abaixo do peso ":
(imc < 25) ? " peso normal ":
(imc < 30) ? " acima do peso ":
(imc < 35) ? " obeso ":
(imc < 40) ? " obesidade morbida ":

return 'seu IMC é $ {imc}, estando assim, $result.';
}


// função para calcuara a maior idade
const printInfo = () => {
    let nome = document.querySelector('#nome').value;
    let nascimento = document.querySelector('#nascimento').value;
    let genero = document.querySelector('#genero').value;
    let email = document.querySelector('#email').value;
    let telefone = document.querySelector('#telefone').value;
    let peso = document.querySelector('#peso').value.replace(",",".");
    let altura = document.querySelector('#altura').valuereplace(",",".");
    
    //saida de dados
    document.querySelector('#result').innerHTML = 'Nome: ${nome}';
    document.querySelector('#result').innerHTML = 'Nascimento: ${nascimento}';
    document.querySelector('#result').innerHTML = 'Genero: ${genero}';
    document.querySelector('#result').innerHTML = 'E-mail: ${email}';
    document.querySelector('#result').innerHTML = 'Telefone: ${telefone}';
    document.querySelector('#result').innerHTML = 'Peso: ${peso}';
    document.querySelector('#imcResult').innerHTML = 'calcularImc;


   // evento


   // evento

   form.addEventListener('submit', function(event) {
    event.preventDefault();
    printInfo();

    //limpa valor
    document.querySelector('#nome').value '';
    document.querySelector('#nascimento').value '';
    document.querySelector('#genero').value '';
    document.querySelector('#email').value '';
    document.querySelector('#telefone').value '';
    document.querySelector('#peso').value '';
    document.querySelector('#altura').value '';
        
 
    });
    
    }