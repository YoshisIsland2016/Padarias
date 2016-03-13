$(document).ready(function(){
	function evento(){
		var nome_produto = $('#nome_produto').val();
		var categoriafk = $('#categoriafk').val();
		var promocao = $('#promocao').val();
		
		if(promocao == '1')
			promocao = true;
		else
			promocao = false;
		
		$.post("buscarProduto",{'nome_produto' : nome_produto, 'categoriafk' : categoriafk, 'promocao' : promocao},
		function(dados) {
			$('#tabela').html(dados);
		});
	};
	$("#nome_produto").keyup(function(){
		evento();
	});
	$("#categoriafk").change(function(){
		evento();
	});
	$("#promocao").change(function(){
		evento();
	});
	
});