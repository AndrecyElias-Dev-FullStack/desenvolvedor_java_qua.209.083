const form = document.querySelector('form');

// função para calcuara a maior idade
const maioridade = () => {
    let nome = document.querySelector('#nome').value;
    let idade = document.querySelector('#idade').value;
    const result = (idade >= 18)? 'é maior de idade' : 'é menor de idade';

    //saida de dados
    document.querySelector('#result').innerHTML = '${nome} ${result}.';

    //limpa valor
    document.querySelector('#nome').value '';
    document.querySelector('#idade').value '';
        
    // evento

    form.addEventListener('submit', function(event) {
        event.preventDefault();
        maioridade();
    });
    
    }