from flask import Flask
import json
from werkzeug.wrappers import Response

# creating api endpoint
app = Flask(__name__)

@app.route('/')
def endpoint():
    # importing JSON from text file
    file1 = open("./web_scraper/jsonText.txt", "r")
    fileContent = file1.readline()
    jsonContent = json.loads(fileContent)
    
    # print(type(jsonContent))
    jsonContent = json.dumps(jsonContent,indent=4)
    # print(jsonContent)

    file1.close()
    return Response(jsonContent,mimetype='json')


# https://www.freecodecamp.org/news/web-scraping-python-tutorial-how-to-scrape-data-from-a-website/
# https://www.digitalocean.com/community/tutorials/how-to-create-your-first-web-application-using-flask-and-python-3