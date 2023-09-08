class Cardnews extends HTMLElement {
  constructor() {
    super();

    const shadow = this.attachShadow({ mode: 'open' })
    shadow.appendChild(this.build());
    shadow.appendChild(this.styles())
  }

  build() {
    const componentRoot = document.createElement("div");
    componentRoot.setAttribute("class", "card")

    const cardLeft = document.createElement("div");
    cardLeft.setAttribute("class", "card__left");

    const autor = document.createElement("span");
    autor.textContent = "By " + (this.getAttribute("autor") || "Anonymos");

    const linkTitle = document.createElement("a");
    linkTitle.textContent = this.getAttribute("title");
    linkTitle.href = this.getAttribute('url-link')

    const newsContent = document.createElement("p");
    newsContent.textContent = this.getAttribute("content")

    cardLeft.appendChild(autor);
    cardLeft.appendChild(linkTitle);
    cardLeft.appendChild(newsContent);

    const cardRight = document.createElement("div");
    cardRight.setAttribute("class", "card__right");

    const newsImage = document.createElement("img");
    newsImage.src = this.getAttribute('photo') || "assets/darth-vader.webp";
    newsImage.alt = "Foto da notícias"
    cardRight.appendChild(newsImage);

    componentRoot.appendChild(cardLeft);
    componentRoot.appendChild(cardRight);


    return componentRoot;
  }

  styles() {
    const style = document.createElement("style");
    style.textContent = `
    .card {
      width: 100%;
      -webkit-box-shadow: 0px 4px 17px 0px rgba(0, 0, 0, 0.75);
      -moz-box-shadow: 0px 4px 17px 0px rgba(0, 0, 0, 0.75);
      box-shadow: 0px 4px 17px 0px rgba(0, 0, 0, 0.75);
      display: flex;
      flex-direction: row;
      justify-content: space-between;
    }
    
    .card__left,
    .card__right {
      border: 1px solid blue;
    }
    
    .card__left {
      display: flex;
      flex-direction: column;
      justify-content: center;
    }
    
    .card__left span {
      font-weight: 200;
    }
    
    .card__left a {
      margin-top: 15px;
      font-family: 25px;
      color: #000;
      font-weight: bold;
      text-decoration: none;
    }
    
    .card__left p {
      color: #777777;
    }
    
    img {
      width: 250px;
    }
    `;
    return style
  }
}

customElements.define('card-news', Cardnews);