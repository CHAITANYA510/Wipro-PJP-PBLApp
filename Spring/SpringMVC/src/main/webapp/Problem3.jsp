<!DOCTYPE html>
<html>
    <head>
        <title>Spring MVC</title>
        <style>
            table{
                margin-right: auto;
                margin-left: auto;
            }
        </style>
    </head>
    <body>
        <div style="text-align:center;">
            <h1>Problem 3</h1>
            <form name="AddMarks" action="Problem3">
                <table>
                    <tr>
                        <td><label for="scimarks">Enter Science marks</label></td>
                        <td><input type="number" id="scimarks" name="sciencemarks"></td>
                    </tr>
                    <tr>
                        <td><label for="mathsmarks">Enter Maths marks</label></td>
                        <td><input type="number" id="mathsmarks" name="mathsmarks"></td>
                    </tr>
                    <tr>
                        <td><label for="engmarks">Enter Science marks</label></td>
                        <td><input type="number" id="engmarks" name="englishmarks"></td>
                    </tr>
                    <tr>
                        <td colspan="2" style="text-align: center;">
                            <input type="submit" value="Submit">
                            <input type="reset">
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>