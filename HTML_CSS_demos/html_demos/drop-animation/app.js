var drops = document.querySelectorAll('.droplet');
var minSpeed = 0.5;

document.addEventListener('animationstart', () => {
	drops.forEach((drop) => {
		let left = Math.random() * 100;
		drop.style.left = left + '%';
		drop.style.animation = `gravity ${minSpeed+Math.random()}s linear infinite 0s`;// ${Math.random()}s`;
	});
});