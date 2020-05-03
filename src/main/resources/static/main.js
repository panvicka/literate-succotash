/**
 * 
 */

$('document').ready(function() {
	$('.table #editButton').on('click', function(event) {

		event.preventDefault();

		var href = $(this).attr('href');
		
		$.get(href, function(parameter,status) {
			console.log(parameter.id);
			console.log(parameter.parId);
			
			$('#parIdEdit').val(parameter.parId);
			$('#descriptionEdit').val(parameter.description);
			$('#categoryEdit').val(parameter.category);
			$('#IdEdit').val(parameter.id);
		});
		
		
		$('#updateModal').modal();
	});
	
	
	$('.table #deleteButton').on('click',function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);		
		$('#deleteModal').modal();
	});
	
	
});


