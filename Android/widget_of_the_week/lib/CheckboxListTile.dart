import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  static const String _title = 'Flutter Code Sample';

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: _title,
      home: Scaffold(
        appBar: AppBar(title: const Text(_title)),
        body: ColorList(),
      ),
    );
  }
}

class ColorList extends StatefulWidget {
  @override
  _ColorListState createState() => _ColorListState();
}

class _ColorListState extends State<ColorList> {
  ValueNotifier<int> _activeColorNotifier;
  ValueNotifier<int> _checkColorNotifier;

  // there are fewer accents than primaries
  final _colorCount = Colors.primaries.length - 3.0;

  @override
  void initState() {
    _activeColorNotifier = ValueNotifier(0);
    _checkColorNotifier = ValueNotifier(0);
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return Column(
      children: <Widget>[
        Row(
          children: <Widget>[
            Padding(
              padding: const EdgeInsetsDirectional.only(start: 16.0),
              child: Text("Active Color: "),
            ),
            Expanded(
              child: Slider(
                min: 0,
                max: _colorCount,
                value: _activeColorNotifier.value.toDouble(),
                onChanged: (value) =>
                    setState(() => _activeColorNotifier.value = value.floor()),
                activeColor: Colors.primaries[_activeColorNotifier.value],
                inactiveColor: Colors.accents[_activeColorNotifier.value],
              ),
            ),
          ],
        ),
        Row(
          children: <Widget>[
            Padding(
              padding: const EdgeInsetsDirectional.only(start: 16.0),
              child: Text("Check Color: "),
            ),
            Expanded(
              child: Slider(
                min: 0,
                max: _colorCount,
                value: _checkColorNotifier.value.toDouble(),
                onChanged: (value) =>
                    setState(() => _checkColorNotifier.value = value.floor()),
                activeColor: Colors.primaries[_checkColorNotifier.value],
                inactiveColor: Colors.accents[_checkColorNotifier.value],
              ),
            ),
          ],
        ),
        Expanded(
          child: ListView.builder(
            itemCount: 10,
            itemBuilder: (context, index) {
              return CheckItem(
                activeNotifier: _activeColorNotifier,
                checkNotifier: _checkColorNotifier,
              );
            },
          ),
        ),
      ],
    );
  }
}

class CheckItem extends StatefulWidget {
  final ValueNotifier activeNotifier;
  final ValueNotifier checkNotifier;

  CheckItem(
      {Key key, @required this.activeNotifier, @required this.checkNotifier})
      : super(key: key);

  @override
  _CheckItemState createState() => _CheckItemState();
}

class _CheckItemState extends State<CheckItem> {
  bool _checked = false;
  bool _selected = false;

  Color _activeColor = Colors.green;
  Color _checkColor = Colors.black;

  @override
  void initState() {
    widget.checkNotifier.addListener(() {
      setState(() {
        _checkColor = Colors.primaries[widget.checkNotifier.value];
      });
    });

    widget.activeNotifier.addListener(() {
      setState(() {
        _activeColor = Colors.primaries[widget.activeNotifier.value];
      });
    });

    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return CheckboxListTile(
      title: Text('Check! Mate?'),
      value: _checked,
      activeColor: _activeColor,
      checkColor: _checkColor,
      onChanged: (bool value) {
        setState(() {
          _checked = value;
          _selected = value;
        });
      },
      selected: _selected,
      secondary: Icon(Icons.beach_access),
      controlAffinity: ListTileControlAffinity.trailing,
    );
  }
}
