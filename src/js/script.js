document.getElementById('transactionForm').addEventListener('submit', function(event) {
    // Obtém os valores dos campos CPF, Valor e Método de Pagamento
    var cpfValue = document.getElementById('cpf').value;
    var valorValue = document.getElementById('valor').value;
    var pagamentoValue = document.getElementById('pagamento').value; // Obtém o método de pagamento selecionado

    // Codifica os valores para evitar problemas com caracteres especiais na URL
    var encodedCPF = encodeURIComponent(cpfValue);
    var encodedValor = encodeURIComponent(valorValue);
    var encodedPagamento = encodeURIComponent(pagamentoValue); // Codifica o método de pagamento

    // Constrói a URL de redirecionamento com os parâmetros
    var redirectURL = 'sucess.html?cpf=' + encodedCPF + '&valor=' + encodedValor + '&pagamento=' + encodedPagamento;

    // Redireciona para a página sucess.html
    window.location.href = redirectURL;

    // Impede o envio padrão do formulário
    event.preventDefault();
});
