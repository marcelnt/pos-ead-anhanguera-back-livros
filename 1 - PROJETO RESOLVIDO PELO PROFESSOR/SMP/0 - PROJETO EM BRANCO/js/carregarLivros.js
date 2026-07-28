window.addEventListener('load', async function(){
    let url = 'http://localhost:8080/livro'

    let resposta = await fetch(url)

    let dados = await resposta.json()

    let divPrincipal = document.getElementById('cardProdutos')


    dados.livros.forEach(function(livro){
    
        let divCaixaProduto = document.createElement('div')
        let h2CaixaTitulo = document.createElement('h2')
        let figureCaixaImagem = document.createElement('figure')
        let imagem = document.createElement('img')
        // let divCaixaTexto = document.createElement('div')


        divCaixaProduto.setAttribute('class', 'caixa_produto')
        h2CaixaTitulo.setAttribute('class', 'caixa_titulo')
        figureCaixaImagem.setAttribute('class', 'caixa_imagem')
        imagem.setAttribute('src', livro.foto)

        divPrincipal.appendChild(divCaixaProduto)
        divCaixaProduto.appendChild(h2CaixaTitulo)
        divCaixaProduto.appendChild(figureCaixaImagem)
        figureCaixaImagem.appendChild(imagem)

        h2CaixaTitulo.innerText = livro.nome
    
    })

})