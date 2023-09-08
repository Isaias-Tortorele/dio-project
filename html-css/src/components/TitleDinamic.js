class TitleDinamic extends HTMLElement {
  constructor() {
    super();

    const shadow = this.attachShadow({ mode: 'open' })
    //base do compenent
    const componentRoot = document.createElement("h1");
    componentRoot.textContent = this.getAttribute("titulo");

    //styles
    const style = document.createElement("style");
    style.textContent = `h1{ color: #F00;}`;

    //enviar para a shadow
    shadow.appendChild(componentRoot);
    shadow.appendChild(style);
  }
}

customElements.define('titulo-dinamico', TitleDinamic)