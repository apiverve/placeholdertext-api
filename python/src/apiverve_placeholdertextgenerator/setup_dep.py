from setuptools import setup, find_packages

setup(
    name='apiverve_placeholdertextgenerator',
    version='1.2.2',
    packages=find_packages(),
    include_package_data=True,
    install_requires=[
        'requests',
        'setuptools'
    ],
    description='Placeholder Text Generator creates custom placeholder text and dummy copy across themes like lorem ipsum, tech, and corporate. Set the paragraph count, sentences per paragraph, and style to receive an array of generated text blocks.',
    author='APIVerve',
    author_email='hello@apiverve.com',
    url='https://apiverve.com/marketplace/placeholdertext?utm_source=pypi&utm_medium=referral&utm_content=homepage',
    classifiers=[
        'Programming Language :: Python :: 3',
        'Operating System :: OS Independent',
    ],
    python_requires='>=3.6',
)
