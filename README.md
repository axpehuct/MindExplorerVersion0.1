# MindExplorerVersion0.1
<div align="justify">
<div>Это пока заготовка местами прописанная детально, местами не написанная вообще. Странно, что не получилось ни одного интерфейса.
Видимо, я не до конца понимаю преимущества их использования.</div>
<div>Если код дорабатывать, то в итоге должно получиться клиент-серверное приложение для Андройд.</div>
<h4>Идея проекта</h4>
<div>Суть заключена в названии: "Исследователь разума". Написано оно будет в первую очередь для любопытных людей, которым интересно изучать себя и других. Приложение дает возможность задать любой вопрос определенному количеству случайных, но выбранных по заданным критериям пользователей, которые в данный момент отвечают на вопросы.</div>
<h4>Теперь детальнее</h4>
<div>Для того, чтобы задать вопрос нужно обладать некоторым количеством баллов. Получить баллы можно отвечая на вопросы и предоставляя дополнительную информацию о себе.
 <br />При регистрации пользователь указывает только язык, пол, год рождения.
 <br/> Вопросы организованы в виде общей для всех пользователей очереди.  Но, каждый отвечающий видит только часть вопросов, которые соответсвуют информации в его профиле. Также, пользователь может указывать какую информацию учитывать при фильтрации вопросов, а какую нет. Например, он может отключить фильтр по году рождения, тогда ему будут показываться вопросы для которых год рождения не указан, и вопросы для его года рождения. Также с полом: его пола, и вопросы, где автору вопроса пол не важен.</div> 
Когда пользователь задает вопрос он вводит текст вопроса, выбирает количество человек, которых хочет опросить и количество минут хранения вопроса в очереди.
Затем, этот вопрос добавляется в очередь. Другой пользователь отвечает на вопрос, и создателю вопроса приходит об этом уведомление.
Он может принять ответ, тогда с него спишется один балл за один устраивающий его ответ. Он может не принять ответ, тогда баллы не списываются, и количество требуемых ответов не изменяется. Он может пожаловаться на ответ, тогда с того, кто ответил спишется один балл, и соответственно количество требуемых ответов на вопрос в очереди также не изменится. Вопрос исчезает из очереди, либо когда всё количество требуемых ответов получено(в этом случае баллы за ответы будут полностью списаны, а за время только частично),
либо когда выйдет время вопроса(тогда баллы за время полностью списываются, а за ответы по количеству принятых ответов, и будет предложено задать вопрос снова).
У отвечающего есть возможность пропустить вопрос, в этом случае никаких уведомлений не посылается, вопрос остается неизменным в очереди.
Также, у отвечающего есть возможность пожаловаться на вопрос с указанием причины жалобы. Это уведомление с причиной жалобы 
посылается создателю вопроса, вопрос полностью удаляется, баллы за оставшееся время и неполученные ответы остаются при создателе,
но списывается один штрафной.
<h4>Немного о реализации</h4>
<div>Планируется, что все данные о пользователе и все вопросы на которые он получил и одобрил ответ будут
храниться на его устроистве. На сервере будет только очередь из неотвеченных и еще актуальных по времени вопросов. Похоже, что в каждом элементе очереди будет: идентификатор создателя вопроса, условия видимости вопроса для отвечающих, текст вопроса, время создания вопроса, сколько раз создатель еще должен получить ответ. С ответом создатель вопроса получает идентификатор пользователя, чтобы иметь возможность одобрить ответ и начислить балл ответившему, а также отправить жалобу на ответ с причиной и списать балл с того, кто ответил, или просто не принять ответ(для этого id, соответсвенно не нужен).</div>
<h4>Немного о монетизации</h4>
<div>Пользователю, который использует приложение не в коммерческих целях, по задумке, ничего платить не придется.
Возможно, эта штука будет интересна компаниям, которые проводят маркетинговые исследования, а также психологам и социологам.</div>
<h4>Постскриптум</h4>
В конце скажу, что то, что написано у меня в коде может противоречить тому, что написано здесь, но вроде все соответсвует.
</div>


