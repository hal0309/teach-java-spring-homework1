# homework1


## 2023年12月3日 課題  

---
できたとこまでプルリク

### Overrideの復習
現状、何も変更を加えない状態で、Postmanで以下のリクエストを順番に送信したとする。
* `{"name": "pochi","type": "dog"}`
* `{"name": "tama","type": "cat"}`
* `{"name": "nakano","type": "human"}`

そうすると、Consoleには以下のような出力が得られる。
~~~
(Console)
animalMap: {dog=AnimalModel(name=pochi)}
animalList: [AnimalModel(name=pochi)]

animalMap: {cat=AnimalModel(name=tama), dog=AnimalModel(name=pochi)}
animalList: [AnimalModel(name=pochi), AnimalModel(name=tama)]

animalMap: {cat=AnimalModel(name=tama), dog=AnimalModel(name=pochi), human=AnimalModel(name=nakano)}
animalList: [AnimalModel(name=pochi), AnimalModel(name=tama), AnimalModel(name=nakano)]
~~~
実装上はAnimalModelを継承したDogModel, CatModel, HumanModelを追加しているはずだが、
Consoleに出力される内容はAnimalModelのままである。

この原因を突き止め、以下の出力になるように修正してください。
~~~
(Console)
animalMap: {dog=DogModel(name=pochi)}
animalList: [DogModel(name=pochi)]

animalMap: {cat=CatModel(name=tama), dog=DogModel(name=pochi)}
animalList: [DogModel(name=pochi), CatModel(name=tama)]

animalMap: {cat=CatModel(name=tama), dog=DogModel(name=pochi), human=HumanModel(name=nakano)}
animalList: [DogModel(name=pochi), CatModel(name=tama), HumanModel(name=nakano)]
~~~

> 今回の変更箇所はtodo付近ではありません。

## 2023年11月23日 課題

---
### Overrideの復習
AnimalModelを継承したサブクラスであるDogModel, CatModel, HumanModelで
親クラスのhello()メソッドをオーバーライドしてください。


### Mapの活用
ListController内にanimalMapを用意した。
addAnimalToMapメソッドが呼び出された時に、animalMapを更新するようにしてください。  
(すでに同じtypeのAnimalModelがMapに存在した場合、上書きしてください)
~~~
(ListController.java)

/* animalMapの中身 */

// name=pochiのDogModelが追加された
{"dog": AnimalModel(name = "pochi")}

// name=takeshiのHumanModelが追加された
{"dog": AnimalModel(name = "pochi"), "human": AnimalModel(name = "takeshi")}

// name=inuのDogModelが追加された(既にあるpochiが削除され、inuのモデルに更新される)
{"dog": AnimalModel(name = "inu"), "human": AnimalModel(name = "takeshi")}

~~~


## 2023年11月19日 課題

---
list操作を復習する。
ベースモデル(AnimalModel)と継承モデル(Human, Dog, Cat)を確認してから取り組むこと。

### Listの作成
それぞれ●●Modelを格納出来るようなList(humanList, dogList, catList, animalList)
をListController内に定義してください。

### [POST] LOCALHOST/list/addAnimal 
以下のようなjsonを受取り、typeに応じて各種モデルに変換、リストに追加する。

~~~
{
    "name": "pochi",
    "type": "dog"
}
~~~

上記のbodyを受け取った場合は`name=pochi`のDogModelをdogListに追加すること。  
typeがhuman, dog, cat何れでも無かった場合はanimalListに追加すること。

### [GET] LOCALHOST/list/get●●List
getDogListを呼び出した際はdogListを得られるようにメソッドを作成する。
その他のリストも同様に全て取得できるようにする。


### 