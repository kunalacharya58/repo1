const slideNavBar = () => {
	const nav = document.querySelector('.nav-links');
	const burger = document.querySelector('.burger');

	const links = document.querySelectorAll('.nav-links li');
	
	burger.addEventListener('click', ()=> {
		nav.classList.toggle('nav-active');

		links.forEach((link, index) => {
			if (link.style.animation) {
				link.style.animation = '';
			} else {
				link.style.animation = `navTextSlide 0.2s ease-in forwards ${0.1 + index / 10}s`;
			}
		});
	});
}

slideNavBar();