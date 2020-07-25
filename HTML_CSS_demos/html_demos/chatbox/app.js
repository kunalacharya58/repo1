let messages = [];
let chatHistory = [];

function toggleChatbox() {
	const chatButton = document.querySelector('.chatbox-btn');

	chatButton.addEventListener('click', () => {
		const chatbox = document.querySelector('.chatbox');
		chatbox.classList.toggle('chatbox-show');
	});
}
toggleChatbox();

function response(message) {
	if(message.includes('hello') || message.includes('hi') || message.includes('hey')) {
		return 'Hello, how can i help you?';
	} else if(message.includes('good')) {
		if(message.includes('morning')) return "Good morning!";
		if(message.includes('afternoon')) return "Good afternoon!";
		if(message.includes('evening')) return "Good evening!";
		if(message.includes('night')) return "Good night!";
	}
}

function send() {
	const message = document.querySelector('#message').value;
	if (messages.length > 8) {
		messages = [];
	}
	messages.push(message);
	chatHistory.push({'me':message});
	document.querySelector('#message').value = '';

	const chatWindow = document.querySelector('.chatbox-window');
	let chats = '';
	messages.forEach( message => {
		chats += `<li class="me chat">${message}</li>`;
		if(message.includes('.clear')) {
			chats = '';
			messages = [];
		}
		if(message.includes('.history')) {
			const history = document.querySelector('#history');
			let text = '';
			chatHistory.forEach(chat => {
				text += `<li>${JSON.stringify(chat)}</li>`;
			});
			history.innerHTML = '<ul>'+text+'</ul>';
		}
		if(message.includes('.time')) {
			let d = new Date();
			chats += `<li class="him chat">It is ${d.toLocaleTimeString()} right now.</li>`;
		}
		if(message.includes('.date')) {
			let d = new Date();
			chats += `<li class="him chat">Today's date is ${d.toLocaleDateString()}.</li>`;
		}
		let reply = response(message);
		if(reply) {
			chats += `<li class="him chat">${reply}</li>`;
			chatHistory.push({'bot':message});
		}
	});
	chatWindow.innerHTML = chats;
	return false;
}