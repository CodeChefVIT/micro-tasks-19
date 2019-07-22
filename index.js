    
var langs = ['Chinese', 'Japanese', 'Hindi'];
var langDropdown = document.getElementById('langs');

langs.forEach((lang) => {
    var newLangNode = makeTemplate(`<a class="dropdown-item" href="#">${lang}</a>`);
    langDropdown.appendChild(newLangNode);
});

function makeTemplate(html) {
    var template = document.createElement('template');
    html = html.trim(); // Never return a text node of whitespace as the result
    template.innerHTML = html;
    return template.content.firstChild;
}