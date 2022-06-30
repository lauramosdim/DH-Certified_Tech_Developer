function deleteBy(id)
{
    let row_id = "#tr_" + id;

                if (window.confirm('Desea eliminar este odontologo?')) {
                  const url = '/odontologos/'+ id;
                  const settings = {
                    method: 'DELETE',
                  };

                  fetch(url, settings).then((response) => {
                    alert('odontólogo eliminado correctamente');
                    location.reload();
                  });
                    document.querySelector(row_id).remove();
                }

}