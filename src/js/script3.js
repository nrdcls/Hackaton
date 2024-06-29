document.addEventListener('DOMContentLoaded', function() {
    // Simulação de dados de doações (poderia ser obtido de um servidor/API)
    const doacoes = [
        { data: '2024-06-29', valor: '1000.00', descricao: 'Doação para educação' },
        { data: '2024-06-28', valor: '500.00', descricao: 'Doação para saúde' },
        { data: '2024-06-27', valor: '300.00', descricao: 'Doação para meio ambiente' }
        // Adicione mais doações conforme necessário
    ];

    const listaExtratos = document.getElementById('lista-extratos');

    // Função para exibir doações na página
    function exibirDoacoes() {
        listaExtratos.innerHTML = ''; // Limpa a lista antes de adicionar novos itens

        doacoes.forEach(doacao => {
            const item = document.createElement('li');
            item.innerHTML = `<strong>${doacao.data}</strong>: ${doacao.descricao} - R$ ${doacao.valor}`;
            listaExtratos.appendChild(item);
        });
    }

    // Chama a função para exibir doações ao carregar a página
    exibirDoacoes();
});