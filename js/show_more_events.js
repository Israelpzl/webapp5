function showMoreEvents() {
    var new_row = $('<div class="row"><div class="col-sm-4"><a href="#"><img src="./assets/img/events/event.jpg" width="300"><h3 class="mt-2">Evento extra</h3></a><p>Texto de ejemplo del evento extra</p></div><div class="col-sm-4"><a href="#"><img src="./assets/img/events/event.jpg" width="300"><h3 class="mt-2">Evento extra</h3></a><p>Texto de ejemplo del evento extra</p></div><div class="col-sm-4"><a href="#"><img src="./assets/img/events/event.jpg" width="300"><h3 class="mt-2">Evento extra</h3></a><p>Texto de ejemplo del evento extra</p></div></div><br>').hide();
    $('#original').append(new_row);
    new_row.slideDown();
}

    
